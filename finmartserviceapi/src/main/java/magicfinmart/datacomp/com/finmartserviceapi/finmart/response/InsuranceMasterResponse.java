package magicfinmart.datacomp.com.finmartserviceapi.finmart.response;

import java.util.List;

import magicfinmart.datacomp.com.finmartserviceapi.finmart.APIResponse;
import magicfinmart.datacomp.com.finmartserviceapi.finmart.model.GeneralinsuranceEntity;
import magicfinmart.datacomp.com.finmartserviceapi.finmart.model.HealthinsuranceEntity;
import magicfinmart.datacomp.com.finmartserviceapi.finmart.model.InsuranceMasterEntity;
import magicfinmart.datacomp.com.finmartserviceapi.finmart.model.LifeinsuranceEntity;

/**
 * Created by Rajeev Ranjan on 23/01/2018.
 */

public class InsuranceMasterResponse extends APIResponse {


    /**
     * HealthMasterData : {"lifeinsurance":[{"InsuID":20,"InsuName":"Aen Life Insurance Company Limited.","InsuShorName":"Aen Life"},{"InsuID":1,"InsuName":"Aviva Life Insurance","InsuShorName":"Aviva"},{"InsuID":2,"InsuName":"Bajaj Allianz Life Insurance","InsuShorName":"Bajaj"},{"InsuID":3,"InsuName":"Bharti AXA Life Insurance","InsuShorName":"Bharti AXA"},{"InsuID":4,"InsuName":"Birla Sun Life Insurance","InsuShorName":"Birla"},{"InsuID":19,"InsuName":"Canara HSBC Oriental Bank of Commerce Life Insurance Company Ltd.","InsuShorName":"CanaraHSBC"},{"InsuID":21,"InsuName":"DLF Pramerica Life Insurance Co. Ltd","InsuShorName":"DLF"},{"InsuID":26,"InsuName":"Edelwiess Tokio Life Insurance Co. Ltd","InsuShorName":"Edelwiess"},{"InsuID":7,"InsuName":"Exide Life Insurance Company","InsuShorName":"ExideLife"},{"InsuID":17,"InsuName":"Future Generali India Life Insurance Company Limited","InsuShorName":"Future Ge"},{"InsuID":5,"InsuName":"HDFC Life Insurance","InsuShorName":"HDFC"},{"InsuID":6,"InsuName":"ICICI Prudential Life Insurance","InsuShorName":"ICICI"},{"InsuID":18,"InsuName":"IDBI Federal Life Insurance Co. Ltd.","InsuShorName":"IDBIFedera"},{"InsuID":24,"InsuName":"India First Life Insurance","InsuShorName":"Indiafirst"},{"InsuID":8,"InsuName":"Kotak Life Insurance","InsuShorName":"Kotak Life"},{"InsuID":9,"InsuName":"Life Insurance Corporation of India","InsuShorName":"LIC"},{"InsuID":10,"InsuName":"Max New York Life Insurance","InsuShorName":"MaxNewyork"},{"InsuID":11,"InsuName":"MetLife India Insurance","InsuShorName":"MetLife"},{"InsuID":25,"InsuName":"Postal Life Insurance","InsuShorName":"PostalLife"},{"InsuID":12,"InsuName":"Reliance Life Insurance","InsuShorName":"Reliance"},{"InsuID":16,"InsuName":"SAHARA INDIA Life Insurance","InsuShorName":"SAHARALife"},{"InsuID":13,"InsuName":"SBI Life Insurance","InsuShorName":"SBI Life"},{"InsuID":14,"InsuName":"Shriram Life Insurance","InsuShorName":"Shriram"},{"InsuID":22,"InsuName":"Star Union Dai-ichi Life Insurance Co Ltd.","InsuShorName":"Star Unio"},{"InsuID":15,"InsuName":"Tata AIG Life Insurance","InsuShorName":"Tata AIG"},{"InsuID":23,"InsuName":"Unit Trust Of India","InsuShorName":"UTI"}],"generalinsurance":[{"InsuID":16,"InsuName":"Agriculture Insurance Co. of India Ltd.","InsuShorName":"Agri.Ins","Health":1},{"InsuID":14,"InsuName":"Apollo Munich Health Insurance Company Limited","InsuShorName":"Apollo","Health":1},{"InsuID":5,"InsuName":"Bajaj Allianz General Insurance Co. Ltd.","InsuShorName":"Bajaj","Health":0},{"InsuID":20,"InsuName":"Bharti AXA General Insurance Company Limited","InsuShorName":"Bharti","Health":0},{"InsuID":6,"InsuName":"Cholamandalam MS General Insurance Co. Ltd.","InsuShorName":"Chola","Health":0},{"InsuID":25,"InsuName":"Cigna TTK Health Insurance Company Ltd.","InsuShorName":"Cigna TTK","Health":1},{"InsuID":15,"InsuName":"Export Credit Guarantee Corporation of India Ltd.","InsuShorName":"Exp-Credit","Health":1},{"InsuID":17,"InsuName":"Future Generali India Insurance Company Limited","InsuShorName":"Future Gen","Health":1},{"InsuID":7,"InsuName":"HDFC ERGO General Insurance Co. Ltd.","InsuShorName":"HDFC","Health":0},{"InsuID":8,"InsuName":"ICICI Lombard General Insurance Co. Ltd.","InsuShorName":"ICICI","Health":0},{"InsuID":9,"InsuName":"IFFCO Tokio General Insurance Co. Ltd.","InsuShorName":"IFFCO","Health":0},{"InsuID":29,"InsuName":"Kotak General Insurance","InsuShorName":"Kotak","Health":0},{"InsuID":24,"InsuName":"L&T General Insurance Company Limited","InsuShorName":"L & T Insurance","Health":0},{"InsuID":26,"InsuName":"Liberty Videocon General Insurance Company Limited","InsuShorName":"Liberty Videocon","Health":0},{"InsuID":28,"InsuName":"Magma HDI General Insurance Company Limited","InsuShorName":"Magma","Health":0},{"InsuID":22,"InsuName":"Max Bupa Health Insurance Company Ltd.","InsuShorName":"Max Bupa","Health":1},{"InsuID":4,"InsuName":"National Insurance Co. Ltd.","InsuShorName":"National","Health":0},{"InsuID":1,"InsuName":"The New India Assurance Co. Ltd.","InsuShorName":"New India","Health":0},{"InsuID":3,"InsuName":"The Oriental Insurance Co. Ltd.","InsuShorName":"Oriental","Health":0},{"InsuID":21,"InsuName":"Raheja QBE General Insurance Company Limited","InsuShorName":"Raheja","Health":0},{"InsuID":10,"InsuName":"Reliance General Insurance Co. Ltd.","InsuShorName":"Reliance","Health":0},{"InsuID":27,"InsuName":"Religare Health Insurance Company Limited","InsuShorName":"Religare","Health":1},{"InsuID":23,"InsuName":"SBI General Insurance Company Limited","InsuShorName":"SBI General","Health":0},{"InsuID":19,"InsuName":"Shriram General Insurance Company Limited","InsuShorName":"Shriram","Health":0},{"InsuID":12,"InsuName":"Star Health and Allied Insurance Company Limited","InsuShorName":"Star Health","Health":1},{"InsuID":11,"InsuName":"Royal Sundaram General Insurance Co. Limited","InsuShorName":"Sundaram","Health":0},{"InsuID":13,"InsuName":"Tata AIG General Insurance Co. Ltd.","InsuShorName":"Tata AIG","Health":0},{"InsuID":18,"InsuName":"Universal Sompo General Insurance Co. Ltd.","InsuShorName":"Uni.Sompo","Health":1},{"InsuID":2,"InsuName":"United India Insurance Co. Ltd.","InsuShorName":"United","Health":0}],"healthinsurance":[{"InsuID":16,"InsuName":"Agriculture Insurance Co. of India Ltd.","InsuShorName":"Agri.Ins","Health":1},{"InsuID":14,"InsuName":"Apollo Munich Health Insurance Company Limited","InsuShorName":"Apollo","Health":1},{"InsuID":25,"InsuName":"Cigna TTK Health Insurance Company Ltd.","InsuShorName":"Cigna TTK","Health":1},{"InsuID":15,"InsuName":"Export Credit Guarantee Corporation of India Ltd.","InsuShorName":"Exp-Credit","Health":1},{"InsuID":17,"InsuName":"Future Generali India Insurance Company Limited","InsuShorName":"Future Gen","Health":1},{"InsuID":22,"InsuName":"Max Bupa Health Insurance Company Ltd.","InsuShorName":"Max Bupa","Health":1},{"InsuID":27,"InsuName":"Religare Health Insurance Company Limited","InsuShorName":"Religare","Health":1},{"InsuID":12,"InsuName":"Star Health and Allied Insurance Company Limited","InsuShorName":"Star Health","Health":1},{"InsuID":18,"InsuName":"Universal Sompo General Insurance Co. Ltd.","InsuShorName":"Uni.Sompo","Health":1}]}
     */

    private InsuranceMasterEntity MasterData;

    public InsuranceMasterEntity getMasterData() {
        return MasterData;
    }

    public void setMasterData(InsuranceMasterEntity MasterData) {
        this.MasterData = MasterData;
    }


}
