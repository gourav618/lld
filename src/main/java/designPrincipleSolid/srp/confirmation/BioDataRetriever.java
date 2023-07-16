package designPrincipleSolid.srp.confirmation;

public class BioDataRetriever {

    /**
     * retrieve bio data for employee id
     * @param e employee object
     * @return bio data
     */
    public String retrieveBioData(Employee e){
        return "Bio data for" + e.getId();
    }

}
