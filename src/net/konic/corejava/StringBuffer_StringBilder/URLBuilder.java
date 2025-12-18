package net.konic.corejava.StringBuffer_StringBilder;
/*
Q13. URLBuilder
Input
Protocol: https
Domain: konic.net
Path: /login
Output
URL: https://konic.net/login
*/
public class URLBuilder {

	public static void main(String[] args) {
		String Protocol = "https";
		String	Domain =  "konic.net";
		String Path = "/login";
		StringBuilder obj = new StringBuilder();
		obj.append(Protocol);
		obj.append("://");
		obj.append(Domain);
		obj.append(Path);
		System.out.println(obj);
	}
}
