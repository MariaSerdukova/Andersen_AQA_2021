package school.lesson8.phoneNumbers;

import java.util.*;

public class Contacts {

    Map<String, List <String>> phonebook;

    public Contacts(){
        phonebook = new HashMap<>();
    }

    public void add(String surname, String number) {
        if(phonebook.containsKey(surname)){
            if(!phonebook.get(surname).contains(number)){
                phonebook.get(surname).add(number);
            }
        }else{ List<String> list = new ArrayList<>();
            list.add(number);
            phonebook.put(surname, list);
        }
    }

    public List<String> get(String surname) {
        return phonebook.get(surname);

    }

}
