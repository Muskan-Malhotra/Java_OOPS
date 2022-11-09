package wait_notify_synch;

public class Message {
	
	   private String msg;
	    
	    public Message(String str){
	        this.msg=str;
	    }

	    public String getMsg() {
	    	System.out.println("This is message constructor msg");
	        return msg;
	    }

	    public void setMsg(String str) {
	        this.msg=str;
	    }


}
