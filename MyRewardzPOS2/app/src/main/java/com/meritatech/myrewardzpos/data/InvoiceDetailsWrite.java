package com.meritatech.myrewardzpos.data;

import com.meritatech.myrewardzpos.AutoSyncServices.ApiClient;
import com.meritatech.myrewardzpos.controller.GlobalVariables;
import com.meritatech.myrewardzpos.model.InvoiceDataModel;
import com.meritatech.myrewardzpos.model.PosServicesInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Waithera on 12/11/2017.
 */

public class InvoiceDetailsWrite extends APIBase <List<InvoiceModel>>{

    public void InventoryListAPICall_write()

    {

//        final MyPosBase myPosBase= new MyPosBase();
//
//
//        try {
//
//            InvoiceModel reesponse;
//            PosServicesInterface inventoryInterface =
//                    ApiClient.getClient().create(PosServicesInterface.class);
//            Call<InvoiceDataModel> call = inventoryInterface.saveInvoice("","");
//
//            call.enqueue(new Callback<InvoiceData>() {
//                @Override
//                public void onResponse(Call<InvoiceData> call, Response<InvoiceData> response) {
//                    InvoiceData reesponse = response.body();
//
//                    if(response.body().recCnt=1)
//                    {
//
//                       // myPosBase.saveInventory(reesponse.Data);
//
//
//                    }
//
//                }
//
//                @Override
//                public void onFailure(Call<InvoiceData> call, Throwable t) {
//
//                }
//
//            });
//        }catch (Exception ex)
//        {
//            ex.getMessage();
//        }

    }
}