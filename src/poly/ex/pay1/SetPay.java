package poly.ex.pay1;

public class SetPay {

    public boolean setPay(String option, int amount){

        boolean result;
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            kakaoPay.pay(amount);
            return result = kakaoPay.pay(amount);

        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            naverPay.pay(amount);
            return result = naverPay.pay(amount);

        } else {
            DefaultPay defaultPay = new DefaultPay();
            defaultPay.pay(amount);
            return result = defaultPay.pay(amount);
        }
    }
}
