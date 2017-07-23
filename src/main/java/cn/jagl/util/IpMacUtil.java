package cn.jagl.util;

import javax.servlet.http.HttpServletRequest;
/**
 * ��ȡ�ͻ��˵���ʵip��ַ������ȫ׼ȷ��
 * @author ���ַ�
 * @date 2016-8-18
 */
public class IpMacUtil {
	public static String getRealIPAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
	    if(null == ip || 0 == ip.length() || "unknown".equalsIgnoreCase(ip)) {
	        ip = request.getHeader("Proxy-Client-IP");
	    }
	    if(null == ip || 0 == ip.length() || "unknown".equalsIgnoreCase(ip)) {
	        ip = request.getHeader("WL-Proxy-Client-IP");
	    }
	    if(null == ip || 0 == ip.length() || "unknown".equalsIgnoreCase(ip)) {
	        ip = request.getHeader("X-Real-IP");
	    }
	    if(null == ip || 0 == ip.length() || "unknown".equalsIgnoreCase(ip)) {
	        ip = request.getRemoteAddr();
	    }
	    return ip;
	}
}