/*
interfaceler soyutlama yapmak için kullanılabilirler
c# ve java gibi dillerde oop dillerde en çok göz ardı edilen özellikerdir.
programlarda değişime açık olmayı sağlamak açısından önemli

*/
public class Main {
    public static void main(String[] args) {
        SingnUpManager singnUpManager = new SingnUpManager(new AgeUserCheckService());
        singnUpManager.singUp(new User(1, "@hllbr", 28));
        SingnUpManager singnUpManager1 = new SingnUpManager(new ComlexUserCheckServise());
        singnUpManager1.singUp(new User(2, "@prince", 4));
    }
    //bu yöntemler sayesinde değişime açık hale geldi son kullanım alanını değiştirerek sistemi değişikliklere adapte etmiş oluyoruz
}
