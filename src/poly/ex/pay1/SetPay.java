package poly.ex.pay1;

public class SetPay {

    public boolean setPay(String option, int amount){

        boolean result;
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            return result = kakaoPay.pay(amount);

        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            return result = naverPay.pay(amount);

        } else if (option.equals("new")) {
            NewPay newPay = new NewPay();
            return result = newPay.pay(amount);

        } else {
            DefaultPay defaultPay = new DefaultPay();
            return result = defaultPay.pay(amount);
        }
    }
}
