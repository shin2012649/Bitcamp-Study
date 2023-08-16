package bitcamp.util;

public class NcpConfig {
  private String endPoint= "https://kr.object.ncloudstorage.com"; // ncp.endPoint 프로퍼티를 받는 필드
  private String regionName= "kr-standard"; // ncp.regionName 프로퍼티를 받는 필드
  private String accessKey= System.getProperty("accesskey"); // ncp.accessKey 프로퍼티를 받는 필드
  private String secretKey= System.getProperty("secretkey"); // ncp.secretKey 프로퍼티를 받는 필드
  
  public NcpConfig() {
    System.out.println(System.getProperty("accesskey"));
    System.out.println(System.getProperty("secretkey"));
  }
  

  
  
  public String getEndPoint() {
    return endPoint;
  }
  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }
  public String getRegionName() {
    return regionName;
  }
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }
  public String getAccessKey() {
    return accessKey;
  }
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }
  public String getSecretKey() {
    return secretKey;
  }
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  
  
}
