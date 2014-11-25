package com.ecwid.mailchimp.method.v2_0.reports;

import java.util.Date;

import com.ecwid.mailchimp.MailChimpObject;

public class Activity extends MailChimpObject {

	@Field
	public String action;

	@Field
	public Date timestamp;

	@Field
	public String url;

	@Field
	public String ip;
}
