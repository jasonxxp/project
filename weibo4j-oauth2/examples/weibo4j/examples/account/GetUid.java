package weibo4j.examples.account;

import weibo4j.Account;
import weibo4j.Weibo;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.WeiboException;
import weibo4j.org.json.JSONObject;

public class GetUid {

	public static void main(String[] args) {
		Weibo weibo = new Weibo();
		String access_token = "2.00fuCttBsOhYDC549dbdd9c7YDLvID";
		weibo.setToken(access_token);
		Account am = new Account();
		try {
			JSONObject uid = am.getUid();
			Log.logInfo(uid.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
