package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Address;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2013-08-29T15:21:55")
@StaticMetamodel(Emp.class)
public class Emp_ { 

    public static volatile SingularAttribute<Emp, Long> id;
    public static volatile SingularAttribute<Emp, String> name;
    public static volatile SetAttribute<Emp, Address> setOfAdd;

}