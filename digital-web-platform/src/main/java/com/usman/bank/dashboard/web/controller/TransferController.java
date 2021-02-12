package com.usman.bank.dashboard.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.response.ResponseDTO;
import com.usman.bank.transfer.request.KNetPaymentReq;
import com.usman.bank.transfer.request.KnetResponseInfo;
import com.usman.bank.transfer.response.KNetPaymentRes;
import com.usman.bank.transfer.response.KNetTransferRes;
import com.usman.bank.dashboard.request.KnetInfo;
import com.usman.bank.dashboard.request.PayInfo;

@Controller
@RequestMapping("/")
public class TransferController {

	private static final Logger LOG = LogManager.getLogger(TransferController.class);

	@Autowired
	RestTemplate restTemplate;

	private final String TRANSFER_SERVICE = "http://10.7.91.40:8093/transfer-mgmt";

	@GetMapping({ "/", "/default" })
	public String hello(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		LOG.debug("web default started......." + name);
		model.addAttribute("name", name);
		return "/default";
	}

	@GetMapping(value = "/knet/pay")
	public String startPay(Model model, @RequestParam(value = "env") String env, @RequestParam(value = "l") String lang,
			@RequestParam(value = "t") String token) {
		LOG.debug("web started.......{},{},{}", env, lang, token);
		try {
			String payUrl = "/knet/pay?env=" + env + "&l=" + lang + "&t=" + token;
			ResponseEntity<ResponseDTO> responseObj = restTemplate.getForEntity(TRANSFER_SERVICE + payUrl,
					ResponseDTO.class);
			LOG.info("TransferController.startPay:" + responseObj.getStatusCodeValue());
			ResponseDTO<KNetPaymentRes> body = responseObj.getBody();
			if (responseObj.getStatusCode().equals(HttpStatus.OK)) {
				LOG.info("start pay service called successfully.");
				LOG.info("Get Pay Body:{}", body);
			}
			model.addAttribute("status", body.getStatus());
			model.addAttribute("response", body.getResponse());
		} catch (Exception ex) {
			LOG.error("Error while calling knet/pay:" + ex.getMessage());
			LOG.error(ex);
		}
		return "/start-pay";
	}

	// @CrossOrigin(origins = "*")
	@PostMapping(value = "/knet/confirm")
	public ModelAndView submitConfirm(ModelAndView model, @RequestBody PayInfo payinfo) {
		LOG.debug("\n ***web submitConfirm started.......:{}", payinfo);
		try {
			KNetPaymentReq payReq = new KNetPaymentReq();
			payReq.setBbynPaymentId(payinfo.getBbynPaymentId());
			payReq.setBbynTrackId(payinfo.getBbynTrackId());
			payReq.setCif(payinfo.getCif());
			payReq.setCustId(payinfo.getCustId());
			payReq.setAmountInKwd(payinfo.getAmountInKwd());
			payReq.setFromAccount(payinfo.getFromAccount());
			payReq.setToAccount(payinfo.getToAccount());
			payReq.setStage(payinfo.getStage());
			payReq.setStatus(payinfo.getStatus());
			payReq.setBbynRefId(payinfo.getBbynRefId());
			payReq.setTransferTypeId(payinfo.getTransferTypeId());
			payReq.setIsSmsSent(payinfo.getIsSmsSent());
			payReq.setTokenReq(null);
			ResponseEntity<ResponseDTO> responseObj = restTemplate.postForEntity(TRANSFER_SERVICE + "/knet/confirm",
					payReq, ResponseDTO.class);
			LOG.info("TransferController.submitConfirm:" + responseObj.getStatusCodeValue());
			ResponseDTO<KNetTransferDTO> body = responseObj.getBody();
			if (responseObj.getStatusCode().equals(HttpStatus.OK)) {
				LOG.info("submitConfirm service called successfully.");
				LOG.info("Get Confirm Body:{}", body);
			}
			model.addObject("status", body.getStatus());
			model.addObject("response", body.getResponse());
		} catch (Exception ex) {
			LOG.error("Error while calling knet/confirm:" + ex.getMessage());
			ex.printStackTrace();
		}
		model.setViewName("/knet-confirm");
		return model;
	}

	@PostMapping(value = "/response", consumes = { "application/x-www-form-urlencoded" })
	public ModelAndView displayResponse(ModelAndView model, KnetInfo knetInfo) {
		LOG.debug("web displayResponse started.......{}", knetInfo.toString());
		try {
			KnetResponseInfo responseInfo = new KnetResponseInfo();
			responseInfo.setTrackid(knetInfo.getTrackid());
			responseInfo.setPaymentid(knetInfo.getPaymentid());
			responseInfo.setTrandata(knetInfo.getTrandata());
			responseInfo.setRef(knetInfo.getRef());
			LOG.debug("responseInfo:---{}", responseInfo.toString());
			ResponseEntity<ResponseDTO> response = restTemplate.postForEntity(TRANSFER_SERVICE + "/knet/response",
					responseInfo, ResponseDTO.class);
			LOG.info("TransferController.displayResponse:" + response.getStatusCodeValue());
			ResponseDTO<KNetTransferDTO> body = response.getBody();
			if (response.getStatusCode().equals(HttpStatus.OK)) {
				LOG.info("displayResponse service called successfully.");
				LOG.info("Get displayResponse body:{}", body);
				LOG.info("Get displayResponse getStatus:{}", body.getStatus());
			}
			model.addObject("status", body.getStatus());
			model.addObject("response", body.getResponse());
		} catch (Exception ex) {
			LOG.error("Error while calling knet/response:" + ex.getMessage());
			ex.printStackTrace();
		}
		model.setViewName("/knet-response");
		return model;
	}

	/**
	 * KNet error page
	 * 
	 * @return
	 */
	@GetMapping(value = "/knet/error")
	public String displayError() {
		LOG.debug("web displayError started.......");
		return "/knet-error";
	}

	/**
	 * Default error page
	 * 
	 * @return
	 */
	@GetMapping(value = "/error")
	public String error(HttpServletRequest request, HttpServletResponse response) {
		LOG.debug("web error started.......");
		try {

			System.out.println("request do something:{}" + request);
			System.out.println("response do something:{}" + response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/error";
	}

	@GetMapping(value = "/knet/history")
	public String getHistory(Model model) {
		LOG.debug("web getHistory started.......");
		try {
			ResponseEntity<KNetTransferRes> response = restTemplate.getForEntity(TRANSFER_SERVICE + "/knet/history",
					KNetTransferRes.class);
			LOG.info("TransferController.getHistory:" + response.getStatusCodeValue());
			if (response.getStatusCode().equals(HttpStatus.OK)) {
				LOG.info("History Body:{}", response.getBody());
			}
			model.addAttribute("data", response.getBody().getTransferList());
		} catch (Exception ex) {
			LOG.error("Error while calling knet/historyr:" + ex.getMessage());
			LOG.error(ex);
		}
		return "/knet-history";
	}

}
