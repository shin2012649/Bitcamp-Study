package bitcamp.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("ncp.properties")
public class NcpConfig {
  @Value("${ncp.end.point}") private String endPoint;
  @Value("${ncp.region.name}") private String regionName;
  @Value("${ncp.accessKey}") private String accessKey;
  @Value("${ncp.secretKey}") private String secretKey;

  public NcpConfig() {
    System.out.println("NcpConfig() 호출됨!");
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
