package com.xkx.bookmanager.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id ="2021000119680223";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCzdMHQ/7wEkELern9w1u1KPEY88P+ErePgO2wiFxspVAGl5jBaIozFOm3WFIvcUtXePqDekyPOtsndBuKYkMSbgKSG67Tveqxb1tRICfxtrTuuhGJbMBPXtWxjQ1DzXpP0YC2lBmzC+N/NDfKeV+yJBTb6CZ0pbC14qIc5AqeQ+O0zbdPKNLM3Lr5cn4OmemWWi2R02GVJUrDJRKUVnBrW+tGv56Fy6qSs5phV6P7u5e+0ueXRdXz8CpprF567GPcc7YnUpsUQi0+RrDvBBsA9Uqnp6/6l4CvhPUZVc9zipso/vAjhtzfUkQfIRlABeE9Rl0LM3aUJ3qqqojqwxJN5AgMBAAECggEBAIrwNq7NkJAn8N3fVCPVA1qaV/cOz4W169vLpeiu4wSYWb5L/duLLFn25tr8hVxLdfHfo0UvvmVo99j8X6unSdDrRHaBP1C6NX/VT/2GXb28hZyUOmJHUtWLTSN9FsuVyg9F95Dw7Hv3m65ywgj+Ic/kDbCAiQFtE7d7I1ZsS7fc9FOb+TRV1d+yF8Wsl+yg7rgXeUxuf4m9Tbd4YWbUhmijI4HUa+hcaV4Fymwr7+1TaaOkdtlhx0Jid58EiHxeZdwG5lcRVjLw9PcAoBG84fpC8NQQgAKunlc5L0GxbGBrGL+qR4TtIy6NVWXYxQDERacy3TcY/vAiWE2CRvF1GFECgYEA7supMBot75jENUNBqGw2xLZmrIxlMo13CV98ynaUOmKaFoGXo/1ioDSznRPnvbltkOGv4znfmjL0bEbpZ7yuumIq+1AdZ9MFpZZ6YXgIWbLQMAFPF+Oulb3msym0SrrlidN1FYW1k4ISD7IEHPw2tVxgGMby/7AC25rrH4S6WBsCgYEAwGKj+1+1qhoWYdPR6Tot2ydu1lyyBdRF7ne8Tk3z5Bn/hF0Sq6PdstgQjMaA5qtKxA8B4nlucsdC+P8WJBl72CI0oTdDkiJXlywlhs2kB7F0eZc8MTD+/JwGXKBfaqvdTDw694+lp6dbFkMcWE7Pi2jpkJ1yamAg6E8XfWVVo/sCgYEAii3Zehc8C5AHwZZokPAFhTDTGvemu2j2v7q8eF/DiEF0Tp+wwtklz/SPFs7k43lAOH0QDVl41T61B07FUxzwsrOJkaEbUu/eLaJ0sKAHnPgG1jB7tyQt60JXE8eHJ1Mc7fMppkmX94JltyVYkfk0IyAQD2ZYSLJuBOuRMMzaE48CgYA2cfP8aNqtmBJrfxmxynA9zEwWyEbtVWSxFxuogXEbRaxFVl25S3erbHBKlsbWAPX4xFKBOGJkgzXV58LpVnjw8sU4Nr6dtbBaLPk1zC62qqbO3lj/huEytikqv4whUSAgug7qDrIP31Hs2/NCnpMn3fnznktKBYhqli+Mokf5TwKBgQCWkuzL0MvIwRkp2GnicjrmbR79YPXbkGA6X7clsfJyKkFMkzZlJAH4q16PanW7AifdKGUVr6Ug2lWAvOkL+s8Gei717++IOeJUWyckgQCXTEfNVDvG3NBsmsk7SjaYGbp3+8ksrs1Z78NDPTwG/TmzxvA4vvMVTHLYW0BMKfBCLA==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs3TB0P+8BJBC3q5/cNbtSjxGPPD/hK3j4DtsIhcbKVQBpeYwWiKMxTpt1hSL3FLV3j6g3pMjzrbJ3QbimJDEm4Ckhuu073qsW9bUSAn8ba07roRiWzAT17VsY0NQ816T9GAtpQZswvjfzQ3ynlfsiQU2+gmdKWwteKiHOQKnkPjtM23TyjSzNy6+XJ+DpnpllotkdNhlSVKwyUSlFZwa1vrRr+ehcuqkrOaYVej+7uXvtLnl0XV8/Aqaaxeeuxj3HO2J1KbFEItPkaw7wQbAPVKp6ev+peAr4T1GVXPc4qbKP7wI4bc31JEHyEZQAXhPUZdCzN2lCd6qqqI6sMSTeQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问  return_url.jsp
    public static String return_url ="http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

