import java.lang.annotation.Annotation;

@DeviceInformation(model = " pad")
public class Device {
    Device() {
    }

    private DeviceInformation getDeviceInformation() {
        Annotation[] annotations = this.getClass().getAnnotations(); //getClass = 클래스의 변수,메소드 등 가져온다. 클래스를 내부적으로 생성
        for(Annotation annotation : annotations) {
            if (annotation instanceof DeviceInformation) {
                return  (DeviceInformation) annotation;
            }
        }
        throw new UnsupportedOperationException("No Device Information");
    }

    public String getType() {
        try {
            return this.getDeviceInformation().type();
        }
        catch(Exception e) {
            return "unknown";
        }
    }

    public String getModel() {
        try {
            return  this.getDeviceInformation().model();
        }
        catch(Exception e) {
            return "unknown";
        }
    }
}
