package com.ecwid.mailchimp.method.v2_0.reports;

import java.util.List;

import com.ecwid.mailchimp.MailChimpAPIVersion;
import com.ecwid.mailchimp.MailChimpMethod;
import com.ecwid.mailchimp.MailChimpObject;
import com.ecwid.mailchimp.method.v2_0.lists.Email;

/**
 *
 * @author Judy Ng <judy@spiekerpoint.com>
 */
@MailChimpMethod.Method(name = "reports/member-activity", version = MailChimpAPIVersion.v2_0)
public class MemberActivityMethod extends MailChimpMethod<MemberActivityResult> {
	
	@Field
	public String cid;
	
	@Field 
	public List<Email> emails;	
}