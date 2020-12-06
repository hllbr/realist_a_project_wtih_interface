
public class SingnUpManager {//iş Katmanı
    private IUserCheckService iUserCheckService;

    public SingnUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
        //getter and setter ile de göndrebilirz fakat en yaygın yöntem constructor ile göndermektir
    }
    public void singUp(User user){
       // AgeUserCheckService ageUserCheckService = new AgeUserCheckService();
        if(iUserCheckService.checkUser(user)){
        System.out.println("Kullanıcı Kayıt oldu " +user.getName());
    }else{
            System.out.println("Kullanıcı Kayıt  Olamadı.");
        }
    
        //System.out.println("Kullanıcı Kayıt Olamadı");
    }
    
}
