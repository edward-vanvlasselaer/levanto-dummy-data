package models;

import main.StandardMethod;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Edward on 13/04/2016.
 */
public class Addresses {
    private Integer id;
    private Integer zip_code_id; //FK
    private Integer country_id; //FK
    private String street;
    private Date created_at;
    private Date updated_at;

    Date dt = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.ffffff");


}
