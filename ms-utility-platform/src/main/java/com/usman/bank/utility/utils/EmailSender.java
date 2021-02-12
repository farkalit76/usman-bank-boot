/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.utils;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.usman.bank.utility.request.EmailReq;
import com.usman.bank.utils.Utility;

/**
 * Description: This class EmailSender.java
 *
 * @author vXebiau
 * @date Nov 26, 2019
 * @version 1.0
 *
 */
@Component
public class EmailSender {

	private static final Logger LOG = LogManager.getLogger(EmailSender.class);

	@Autowired
	private JavaMailSender javaMailSender;

	@Value("${spring.mail.from.email}")
	private String fromEmail;
	
	/**
	 * Send email with Usman UAT environment.
	 * 
	 * @param emailreq
	 * @throws Exception
	 */
	public void sendEmail(EmailReq emailReq) throws Exception {
		LOG.info("Email sending started.....");
		SimpleMailMessage msg = new SimpleMailMessage();
		StringBuilder emails = new StringBuilder();
		String[] toEmailIds = emailReq.getToEmailIds();
		if (!Utility.isEmpty(toEmailIds)) {
	        for (int i = 0; i < toEmailIds.length; i++) {
	        	emails.append(toEmailIds[i]).append(",");
	        }
		}
		msg.setTo(emails.toString());
		msg.setFrom(fromEmail);
		msg.setSubject(emailReq.getSubject());
		msg.setText(emailReq.getBody());

		javaMailSender.send(msg);
		LOG.info("DONE successfully.");
	}
	
	/**
	 * 
	 * @param emailreq
	 * @throws MessagingException
	 * @throws IOException
	 */
	public void sendEmailWithAttachment(EmailReq emailreq) throws MessagingException, IOException {
		LOG.info("Starting Email sending with attachement.....");
        MimeMessage msg = javaMailSender.createMimeMessage();

        // true = multipart message
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
        helper.setTo("1@gmail.com");

        helper.setSubject("Testing from Spring Boot");

        // default = text/plain
        //helper.setText("Check attachment for image!");

        // true = text/html
        helper.setText("<h1>Check attachment for image!</h1>", true);

        helper.addAttachment("my_photo.png", new ClassPathResource("android.png"));

        javaMailSender.send(msg);
        LOG.info("DONE successfully.");
    }
}
