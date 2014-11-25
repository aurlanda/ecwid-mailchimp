package com.ecwid.mailchimp.method.v2_0.reports;

import com.ecwid.mailchimp.MailChimpAPIVersion;
import com.ecwid.mailchimp.MailChimpMethod;
import com.ecwid.mailchimp.MailChimpObject;

@MailChimpMethod.Method(name = "reports/unsubscribes", version = MailChimpAPIVersion.v2_0)
public class UnsubscribesMethod extends MailChimpMethod<UnsubscribesResult>{
	@Field
	public String cid;
	
	@Field
	public Opts opts;
	
	public static class Opts extends MailChimpObject {
		@Field
		public Integer start;
		
		@Field Integer limit;
	}
}
