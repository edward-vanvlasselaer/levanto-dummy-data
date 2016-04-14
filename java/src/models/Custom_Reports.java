package models;

import java.util.Date;

/**
 * Created by Edward on 13/04/2016.
 */
public class Custom_Reports {
    private Integer id;
    private Integer customer_id; //FK to customer
    private Integer sequence;
    private String name;
    private String query;
    private String params_description;
    private String comments;
    private Date created_at;
    private Date updated_at;
    private Integer master_id;
    private Integer created_by_id;
}
