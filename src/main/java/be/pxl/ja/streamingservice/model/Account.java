package be.pxl.ja.streamingservice.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String email;
    private String password;
    private PaymentInfo paymentInfo;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles;

    public Account(){
        Profile profile = new Profile("profile1");
        profiles = new ArrayList<>();
        profiles.add(profile);
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }

    public void addProfile(Profile profile){
        profiles.add(profile);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean verifyPassword(String password){
        return true;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public Profile getFirstProfile(){
        return profiles.get(0);
    }


}
