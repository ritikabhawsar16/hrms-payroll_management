/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.adt.payroll.event.listener;

import java.io.IOException;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.adt.payroll.event.OnCompOffDetailsSavedEvent;
import com.adt.payroll.service.CommonEmailService;

import jakarta.mail.MessagingException;

@Component
public class OnCompOffDetailsSavedListener implements ApplicationListener<OnCompOffDetailsSavedEvent> {

//    private final MailService mailService;

	private CommonEmailService emailService;

	public OnCompOffDetailsSavedListener(CommonEmailService emailService) {
		this.emailService = emailService;
	}

	/**
	 * As soon as a registration event is complete, invoke the email verification
	 * asynchronously in an another thread pool
	 */
	@Override
	@Async
	public void onApplicationEvent(OnCompOffDetailsSavedEvent onCompOffDetailsSavedEvent) {
//        sendEmailVerification(onUserRegistrationCompleteEvent);
		try {
			emailService.sendEmailVerification(onCompOffDetailsSavedEvent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Send email verification to the user and persist the token in the database.
	 */
//    private void sendEmailVerification(OnPriorTimeDetailsSavedEvent event) {
//        Priortime priortime = event.getPriorTime();
//        String recipientAddress = priortime.getEmail();
//        String emailConfirmationUrl1 = event.getRedirectUrl1().toUriString();
//        String emailConfirmationUrl2 = event.getRedirectUrl2().toUriString();
//
//
//        try {
//            emailService.sendEmailVerification(event,emailConfirmationUrl1, emailConfirmationUrl2,recipientAddress);
//        } catch (IOException | TemplateException | MessagingException e) {
//            throw new MailSendException(recipientAddress);
//        }
//    }
}
