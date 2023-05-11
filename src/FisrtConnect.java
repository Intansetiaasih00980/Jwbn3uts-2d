import netscape.javascript.JSObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class ConnectURI {
    public static void main(String[] args) throws IOException{
        ConnectURI koneksisaya = new ConnectURI();
        URL myAddress = koneksisaya.buildURL
                ("https://harber.mimpoapps.xyz/api/getaccess.php");
        String response = koneksisaya.getResponseFromHttpUrl(myAddress);
        System.out.println(response);
        //decoding JSON
        assert response !=null;
        JSONArray responseJSON = new JSONArray(response);
        ArrayList<responModel> responModel =
                new ArrayList<>();
        for(int i=0; i <responseJSON.length(); i++) {
            responModel resModel = new responModel();
            JSONObject myJSONObject =
                    responseJSON.getJSONObject(i);
            resModel.setMsgnew(myJSONObject.
                    getString("messege"));
            JSObject myJSONObject =
                    responseJSON.getJSONObject(i);
            resModel.setMsg(MyJSONObject.
                    getString("Messege"));
            resModel.setStatus(myJSONObject.
                    getString("status"));
            resModel.setConnect(myJSONObject.
                    getString("Comment"));
            responModel.add(resModel);
        }
        System.out.println("Response are:");
        for(int index=0;index<responseModel.size(); index++){
            System.out.println("MESSAGE : " +
                    responseModel.get(index).getMsg());
            System.out.println("STATUS : " +
                    responseModel.get(index).getStatus());
            System.out.println("COMMENTS : " +
                    responseModel.get(index).getComment());
        }
    }

}