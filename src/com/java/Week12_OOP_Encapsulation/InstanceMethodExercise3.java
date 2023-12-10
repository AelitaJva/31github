package com.java.Week12_OOP_Encapsulation;

public class InstanceMethodExercise3 {
    public static void main(String[] args) {
        Call call = new Call();
        call.setCallType("OUTBOUND");
        call.setStartCall("12:30:00");
        call.setEndCall("13:15:45");
        call.setCaller("+12345678901");
        call.setRecipient("+98765432101");

        call.displayCallDetails();

        // Example usage of getter methods
//        System.out.println("Call Type: " + call.getCallType());
//        System.out.println("Start Time: " + call.getStartCall());
//        System.out.println("End Time: " + call.getEndCall());
//        System.out.println("Caller: " + call.getCaller());
//        System.out.println("Recipient: " + call.getRecipient());
    }
}

class Call {

    private String callType;
    private String startCall;
    private String endCall;
    private String caller;
    private String recipient;

    public Call () {
        this.callType = callType;
        this.startCall = startCall;
        this.endCall = endCall;
        this.caller = caller;
        this.recipient = recipient;
    }

    public String getCallType () {
        return callType;
    }

    public String getStartCall () {
        return startCall;
    }

    public String getEndCall () {
        return endCall;
    }

    public String getCaller () {
        return caller;
    }

    public String getRecipient () {
        return recipient;
    }

    public void setCallType (String callType) {
        this.callType = callType;
    }

    public void setStartCall (String startCall) {
        if(!startCall.isEmpty()) {
            this.startCall = startCall;
        } else {
            System.out.println("Start time cannot be empty.");
        }
    }

    public void setEndCall (String endCall) {
        if(!endCall.isEmpty()) {
            this.endCall = endCall;
        } else {
            System.out.println("End time cannot be empty.");
        }
    }

    public void setCaller (String caller) {
        if(caller.startsWith("+") && caller.length() == 11) {
            this.caller = caller;
        } else {
            System.out.println("Invalid caller phone number.");
        }
    }

    public void setRecipient (String recipient) {
        if(recipient.startsWith("+") && recipient.length() == 11) {
            this.recipient = recipient;
        } else {
            System.out.println("Invalid recipient phone number.");
        }
    }

    public void displayCallDetails () {
        System.out.println("Call Type: " + callType);
        System.out.println("Start Time: " + startCall);
        System.out.println("End Time: " + endCall);
        System.out.println("Caller: " + caller);
        System.out.println("Recipient: " + recipient);
    }
}
