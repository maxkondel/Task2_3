package task;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Query query = (Query) unmarshaller.unmarshal(new URL("http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys"));

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(query, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}