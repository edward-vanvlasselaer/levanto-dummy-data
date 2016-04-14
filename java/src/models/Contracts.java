package models;

import java.util.Date;

/**
 * Created by Edward on 13/04/2016.
 */
public class Contracts {
    private Integer id;
    private Integer master_id; //FK to masters
    private Integer institution_id; //FK to Institutions
    private String name;
    private Integer time;
    private String unit;
    private Date created_at;
    private Date updated_at;
    private Integer maintenance_period;
    private String price;
    private String warranty_amount;
    private String warranty_maintenance_fee;
}
