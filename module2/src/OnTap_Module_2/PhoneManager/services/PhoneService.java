package OnTap_Module_2.PhoneManager.services;

import OnTap_Module_2.PhoneManager.Exception.NotFoundException;
import OnTap_Module_2.PhoneManager.Util.FileHelper;
import OnTap_Module_2.PhoneManager.models.AuthenticPhone;
import OnTap_Module_2.PhoneManager.models.HandPhone;
import OnTap_Module_2.PhoneManager.models.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneService {
    private List<Phone> phones = new ArrayList<>();
    private static final String PATH = "src/OnTap_Module_2/PhoneManager/huyhoang.txt";
    private FileHelper fileHelper = new FileHelper();

    public PhoneService(){
            phones = mapToPhones();
    }
    public void addPhone(Phone phone){
        int lastID = 0;
        if (phones.size() >0){
            lastID = phones.get(phones.size() - 1).getId();
        }
        phone.setId(lastID + 1);
        phones.add(phone);
        fileHelper.writer(PATH,phones,false);
    }

    public List<Phone> findAll(){
        return phones;
    }

    public void delete(int id) throws NotFoundException {
        for (int i = 0;i<phones.size();i++){
            if (phones.get(i).getId() == id){
                phones.remove(i);
                fileHelper.writer(PATH,phones,false);
                return;
            }
        }
        throw new NotFoundException(id + " is not exists");
    }

    public List<Phone> search(String name){
        List<Phone> result = new ArrayList<>();
        for (int i = 0; i< phones.size();i++){
            if (phones.get(i).getName().equalsIgnoreCase(name)){
                result.add(phones.get(i));
            }
        }
        return result;
    }
    private List<Phone> mapToPhones() {
        List<Phone> result = new ArrayList<>();

        List<String> lines = fileHelper.read(PATH);

        for (int i = 0; i < lines.size(); i++) {
            String[] tmp =  lines.get(i).split(",");
            int id = Integer.parseInt(tmp[0]);
            String name = tmp[1];
            double price = Double.parseDouble(tmp[2]);
            String manufacturer = tmp[3];

            if(tmp[tmp.length - 1].equals("0")){
                int granteeByYear = Integer.parseInt(tmp[4]);
                String code = tmp[5];
                AuthenticPhone authentic = new AuthenticPhone(id, name, price, manufacturer, granteeByYear, code);
                result.add(authentic);

            }
            else{
                String country = tmp[4];
                String status = tmp[5];
                HandPhone handPhone = new HandPhone(id, name, price, manufacturer, country, status);
                result.add(handPhone);
            }
        }

        return result;
 }

}
