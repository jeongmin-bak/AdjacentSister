package com.jungmin.adjacentsister;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.Arrays;

public class ShopList extends AppCompatActivity {

    ListView listview = null;
    private ChipGroup cp_group;
    private String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_shoplist);

        ListViewAdapter adapter;
        adapter = new ListViewAdapter();
        cp_group=(ChipGroup)findViewById(R.id.chip_group);
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        Log.e("v확인", String.valueOf(Build.VERSION.SDK_INT));
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.p1),
                "오이쇼", "20대","https://www.oysho.com/kr/") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p2),
                "더달콤", "20대","http://thedalkom.co.kr/") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p3),
                "캘빈클라인", "20대 30대이상", "https://www.calvinklein.com/kr/ko/underwear-women-shop-all/") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p4),
                "츄(Chuu)", "20대","https://www.chuu.co.kr/product/list.html?cate_no=2485") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p5),
                "위아래", "20대 30대이상","http://www.wiarae.com/") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p6),
                "제이스타일", "빅사이즈","http://www.jstyleshop.net/") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p7),
                "엑사브라", "보정속옷 빅사이즈","https://salondeexa.com/exabra.html") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p8),
                "도로시와", "20대 빅사이즈","https://dorosiwa.co.kr/index.html") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p9),
                "하늘하늘", "20대 30대이상","http://www.hn-hn.co.kr/") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p10),
                "쿠키마루", "10대","http://cookiemaru.kr/category/%EB%82%98%EC%8B%9C%EC%86%8D%EC%98%B7/294/") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p11),
                "온리원스", "10대","http://o-onlyonce.com/") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p12),
                "하이주니", "10대","http://hijuni.co.kr/goods/goods_list.php?cateCd=015") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p13),
                "블룸마터니티", "임산부","http://bloommaternity.co.kr") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p15),
                "프리부", "20대","https://freeboo.co.kr/index.html") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p14),
                "힙핑크", "20대","http://www.hippink.com/") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p16),
                "CIELSTORY", "10대","https://smartstore.naver.com/cielstory1?nClickPageType=smartstore.category") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.p17),
                "소임", "임산부","http://www.soim.co.kr/shop/page.html?id=2&xcode=818&n_media=27758&n_query=%EC%9E%84%EC%82%B0%EB%B6%80%EC%86%8D%EC%98%B7&n_rank=1&n_ad_group=grp-m001-01-000000110979817&n_ad=nad-a001-01-000000095908416&n_keyword_id=nkw-m001-01-000000186638985&n_keyword=%EC%9E%84%EC%82%B0%EB%B6%80%EC%86%8D%EC%98%B7&n_campaign_type=1&n_ad_group_type=1&NaPm=ct%3Dkdsk13pk%7Cci%3D0zq0003PZ3ftSSgR%5FuZ6%7Ctr%3Dsa%7Chk%3Db803a1e455a497aadf254b7d62558c7632de8b71") ;


        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.momnuri),
                "맘누리", "임산부","http://www.momnuri.com/shop/shopbrand.html?xcode=045&type=Y&NaPm=ct%3Dkdsk2fjs%7Cci%3D0AG0000NZhftA57%5FrLkG%7Ctr%3Dsa%7Chk%3D423b1b3ff21cb007f8f65d30ef86c6c2fb0b50f7") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.happ),
                "해피텐", "임산부","http://www.happy10.co.kr/shop/shopbrand.html?xcode=045&type=Y&n_media=27758&n_query=%EC%9E%84%EC%82%B0%EB%B6%80%EC%86%8D%EC%98%B7&n_rank=3&n_ad_group=grp-a001-01-000000012052322&n_ad=nad-a001-01-000000079206329&n_keyword_id=nkw-a001-01-000002223411285&n_keyword=%EC%9E%84%EC%82%B0%EB%B6%80%EC%86%8D%EC%98%B7&n_campaign_type=1&n_ad_group_type=1&NaPm=ct%3Dkdsk315k%7Cci%3D0za0001dZhftEb3i0viN%7Ctr%3Dsa%7Chk%3D0ffcac4f5ea090e6641b0be8129991018ab52f35") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bbsmall),
                "바비즈몰", "임산부","https://babizmall.co.kr/category/%EC%9E%84%EC%82%B0%EB%B6%80%EC%86%8D%EC%98%B7-%EC%84%B8%ED%8A%B8/546/") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.z280days),
                "280days", "임산부","http://www.280days.co.kr/m/product_list.html?xcode=021") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.compotlab),
                "컴포트랩", "20대 빅사이즈","http://comfortlab.co.kr/shop/shopbrand.html?xcode=014&type=Y&n_media=122876&n_query=%EB%B9%85%EC%82%AC%EC%9D%B4%EC%A6%88%EC%86%8D%EC%98%B7&n_rank=2&n_ad_group=grp-a001-01-000000008193070&n_ad=nad-a001-01-000000090243698&n_keyword_id=nkw-a001-01-000002812182389&n_keyword=%EB%B9%85%EC%82%AC%EC%9D%B4%EC%A6%88%EC%86%8D%EC%98%B7&n_campaign_type=1&n_ad_group_type=1&NaPm=ct%3Dkdsk917c%7Cci%3D0AK0001BZxftlkgqrL1s%7Ctr%3Dsa%7Chk%3D3f7677e2a4829d4763aad56f6680e18f6b20c345") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.mabyb),
                "메이비 바니", "30대이상 빅사이즈","http://www.maybebonny.com/product/list.html?cate_no=235&n_media=122876&n_query=%EB%B9%85%EC%82%AC%EC%9D%B4%EC%A6%88%EC%86%8D%EC%98%B7&n_rank=3&n_ad_group=grp-m001-01-000001247226169&n_ad=nad-a001-01-000000050127939&n_keyword_id=nkw-m001-01-000001247227225&n_keyword=%EB%B9%85%EC%82%AC%EC%9D%B4%EC%A6%88%EC%86%8D%EC%98%B7&n_campaign_type=1&n_ad_group_type=1&NaPm=ct%3Dkdska30g%7Cci%3D0ze0002mZxftEvUYI0ZA%7Ctr%3Dsa%7Chk%3Da5eae5aad7d205e275fd6021410b708578f75da9") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.lupina),
                "루피나", "빅사이즈","https://www.lupinashop.com/") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.cumomo),
                "큐모모", "20대 30대이상","https://qmomo.co.kr/") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.golden),
                "골든래빗", "10대","https://smartstore.naver.com/goldenrabbit?NaPm=ct%3Dkdsl9k0o%7Cci%3D0zq0000d1hjtWBOYhfpt%7Ctr%3Dsa%7Chk%3Da2c3fb6161ddeedfc39bf17fb443c96349a668ae") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sua),
                "수아팜", "10대","https://suafam.com/goods/catalog?code=00130002&utm_source=naver&utm_medium=cpc&utm_campaign=august&NaPm=ct%3Dkdsld10o%7Cci%3D0za0002L1hjtmyfYQ1mn%7Ctr%3Dsa%7Chk%3D77a67571ab296b7ce099b9c7e58d38d3c2fd5e64") ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.nb),
                "앤비마트", "10대","http://www.nbmart.com/shop/shopbrand.html?xcode=004&type=Y&n_media=122875&n_query=%EC%A3%BC%EB%8B%88%EC%96%B4%EC%86%8D%EC%98%B7&n_rank=16&n_ad_group=grp-a001-01-000000003069658&n_ad=nad-a001-01-000000039405052&n_keyword_id=nkw-a001-01-000000561439241&n_keyword=%EC%A3%BC%EB%8B%88%EC%96%B4%EC%86%8D%EC%98%B7&n_campaign_type=1&n_ad_group_type=1&NaPm=ct%3Dkdslfpgw%7Cci%3D0yy0000I1xjtJI5D8v0b%7Ctr%3Dsa%7Chk%3D27fc05ee7a397ad74f49bf9a1c345184b5a9694f") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pri),
                "프리틴", "10대","http://preteenmoonya.co.kr/") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.plck),
                "플래시크", "보정속옷","http://www.flaseek.com/shop/page.html?id=1") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.gc),
                "가시여우", "보정속옷","http://www.gasifox.co.kr/shop/shopbrand.html?xcode=089&type=O&n_media=122875&n_query=%EC%97%AC%EC%84%B1%EB%B3%B4%EC%A0%95%EC%86%8D%EC%98%B7&n_rank=26&n_ad_group=grp-m001-01-000001000610565&n_ad=nad-a001-01-000000017159621&n_keyword_id=nkw-m001-01-000000493055442&n_keyword=%EC%97%AC%EC%84%B1%EB%B3%B4%EC%A0%95%EC%86%8D%EC%98%B7&n_campaign_type=1&n_ad_group_type=1&NaPm=ct%3Dkdslwc8g%7Cci%3D0Ai0000Q2hjtYa2HlvlG%7Ctr%3Dsa%7Chk%3Dd1a3ece30a1c98c282edd30502271e1e9d302630") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.shes),
                "쉬즈마인드", "보정속옷","http://www.shezmind.com/?act=shop.goods_list&GC=GD02&n_media=122875&n_query=%EC%97%AC%EC%84%B1%EB%B3%B4%EC%A0%95%EC%86%8D%EC%98%B7&n_rank=30&n_ad_group=grp-m001-01-000001005503304&n_ad=nad-a001-01-000000011793351&n_keyword_id=nkw-m001-01-000000692826658&n_keyword=%EC%97%AC%EC%84%B1%EB%B3%B4%EC%A0%95%EC%86%8D%EC%98%B7&n_campaign_type=1&n_ad_group_type=1&NaPm=ct%3Dkdslxr5s%7Cci%3D0Am0001S2hjtXolbLeWC%7Ctr%3Dsa%7Chk%3D5167f0c00b131ce8b711660a2e17e9fad912b178") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bs),
                "비에스샵(쏙샵)", "보정속옷","https://smartstore.naver.com/bosaengshop?nClickPageType=smartstore.category") ;



        final EditText editTextFilter = (EditText)findViewById(R.id.editTextFilter);
        final EditText editText=findViewById(R.id.editText);
       /* cp_group.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            //@SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(ChipGroup chipGroup, int i) {
                Chip select = chipGroup.findViewById(i);
                s+=select.getText().toString();
                Log.e("chip 체크",""+select.isCheckable()+" and "+select.getText().toString());
                if(select != null) {
                    //Log.e("log_cccc", "" + select.getText().toString());
                    //Toast.makeText(ShopList.this, select.getText().toString(), Toast.LENGTH_LONG).show();

                    if(cp_group.isSingleSelection()) {
                        cp_group.setSingleSelection(false);
                        editTextFilter.setText(s+" ");

                        //select.setCheckable(true);
                        //editTextFilter.setEnabled(true);
                            //s = s.replace(" ",select.getText().toString());
                            //editTextFilter.setText(s);

                    }
            }
            }

        });*/
                /*Chip select = chipGroup.findViewById(i);
                Log.e("chip 체크",""+select.isCheckable()+" and "+select.getText().toString());
                String[] strings=s.split(" ");

                select.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        selectedId=view.getId();
                    }
                });

                if(select != null) {
                    //Log.e("log_cccc", "" + select.getText().toString());
                    //Toast.makeText(ShopList.this, select.getText().toString(), Toast.LENGTH_LONG).show();

                    s+=select.getText().toString();
                    editTextFilter.setText(s);
                    select.setCheckable(false);
                    editTextFilter.setEnabled(false);
                }
                if(i==selectedId){
                    select.setCheckable(true);
                    editTextFilter.setEnabled(true);
                    s=s.replace(select.getText().toString(),"");
                    editTextFilter.setText(s);
                }


            }

        });
        Chip chip10=findViewById(R.id.age_10);
        Chip chip20=findViewById(R.id.age_20);
        Chip chip30=findViewById(R.id.age_30);
        Chip chip_ext1=findViewById(R.id.age_ext);
        Chip chip_ext2=findViewById(R.id.age_ext2);
        Chip chip_ext3=findViewById(R.id.age_ext3);

        setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedId=view.getId();
            }
        });*/
        /*

        select.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        final Chip chip10=findViewById(R.id.age_10);
        final Chip chip20=findViewById(R.id.age_20);
        final Chip chip30=findViewById(R.id.age_30);
        final Chip chip_ext1=findViewById(R.id.age_ext);
        final Chip chip_ext2=findViewById(R.id.age_ext2);
        final Chip chip_ext3=findViewById(R.id.age_ext3);

        chip10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Log.e("","isSelected:"+chip10.isChecked());
                if (chip10.isChecked() == true) {
                    if (!s.equals("")) {
                        s = s + " ";
                    }
                    s = s + "10대";
                    String[] strArray=s.split(" ");
                    Arrays.sort(strArray);
                    Log.e("배열 로그", Arrays.toString(strArray));
                    for (String i : strArray) {
                        Log.e("배열 i??:",i);
                        s=Arrays.toString(strArray);
                        s=s.replace("[","");
                        s=s.replace("]","");
                        s=s.replace(",","");
                        editTextFilter.setText(s);
                    }
                    editTextFilter.setEnabled(false);
                }
                else{
                    s = s.replace("10대","");
                    s = s.replace(" ","");
                    editTextFilter.setText(s);
                }
            }

        });
        chip20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chip20.isChecked() == true) {
                    if(!s.equals("")){
                        s=s+" ";
                    }
                    s = s + "20대";
                    String[] strArray=s.split(" ");
                    Arrays.sort(strArray);
                    Log.e("배열 로그", Arrays.toString(strArray));
                    for (String i : strArray) {
                        Log.e("배열 i??:",i);
                        s=Arrays.toString(strArray);
                        s=s.replace("[","");
                        s=s.replace("]","");
                        s=s.replace(",","");
                        editTextFilter.setText(s);
                    }
                    editTextFilter.setEnabled(false);
                } else {
                    s = s.replace("20대", "");
                    s = s.replace(" ","");
                    editTextFilter.setText(s);
                }
            }
        });
        chip30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chip30.isChecked() == true) {
                    if(!s.equals("")){
                        s=s+" ";
                    }
                    s=s+"30대이상";
                    String[] strArray=s.split(" ");
                    Arrays.sort(strArray);
                    Log.e("배열 로그", Arrays.toString(strArray));
                    for (String i : strArray) {
                        Log.e("배열 i??:",i);
                        s=Arrays.toString(strArray);
                        s=s.replace("[","");
                        s=s.replace("]","");
                        s=s.replace(",","");
                        editTextFilter.setText(s);
                    }
                    editTextFilter.setEnabled(false);
                }
                else{
                    s = s.replace("30대이상","");
                    s = s.replace(" ","");
                    editTextFilter.setText(s);
                }
            }
        });
        chip_ext1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chip_ext1.isChecked() == true) {
                    if(!s.equals("")){
                        s=s+" ";
                    }
                    s = s + "보정속옷";
                    String[] strArray=s.split(" ");
                    Arrays.sort(strArray);
                    Log.e("배열 로그", Arrays.toString(strArray));
                    for (String i : strArray) {
                        Log.e("배열 i??:",i);
                        s=Arrays.toString(strArray);
                        s=s.replace("[","");
                        s=s.replace("]","");
                        s=s.replace(",","");
                        editTextFilter.setText(s);
                    }
                    editTextFilter.setEnabled(false);
                }
                else{
                    s = s.replace(" ","");
                    s = s.replace("보정속옷","");
                    editTextFilter.setText(s);
                }
            }

        });
        chip_ext2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chip_ext2.isChecked() == true) {
                    if(!s.equals("")){
                        s=s+" ";
                    }
                    s=s+"임산부";
                    String[] strArray=s.split(" ");
                    Arrays.sort(strArray);
                    Log.e("배열 로그", Arrays.toString(strArray));
                    for (String i : strArray) {
                        Log.e("배열 i??:",i);
                        s=Arrays.toString(strArray);
                        s=s.replace("[","");
                        s=s.replace("]","");
                        s=s.replace(",","");
                        editTextFilter.setText(s);
                    }
                    editTextFilter.setEnabled(false);
                }
                else{
                    s = s.replaceAll("임산부","");
                    s = s.replace(" ","");
                    editTextFilter.setText(s);

                }
            }

        });
        chip_ext3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chip_ext3.isChecked() == true) {
                    if(!s.equals("")){
                        s=s+" ";
                    }
                    s=s+"빅사이즈";
                    String[] strArray=s.split(" ");
                    Arrays.sort(strArray);
                    Log.e("배열 로그", Arrays.toString(strArray));
                    for (String i : strArray) {
                        Log.e("배열 i??:",i);
                        s=Arrays.toString(strArray);
                        s=s.replace("[","");
                        s=s.replace("]","");
                        s=s.replace(",","");
                        editTextFilter.setText(s);
                    }
                    editTextFilter.setEnabled(false);
                }
                else{
                    s = s.replaceAll("빅사이즈","");
                    s = s.replace(" ","");
                    editTextFilter.setText(s);
                }
            }

        });
/*
        String[] strArray=editTextFilter.getText().toString().split(" ");
        Arrays.sort(strArray);
        Log.e("배열 로그",Arrays.toString(strArray));
        editTextFilter.setText(Arrays.toString(strArray));


                    String[] strArray=s.split(" ");
                    Arrays.sort(strArray);
                    Log.e("배열 로그",Arrays.toString(strArray));
                    for (String i : strArray) {
                        Log.e("배열 i??:",i);
                        s=i;
                    }
                    editTextFilter.setText(s);
                    editTextFilter.setEnabled(false);
        */

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                String filterText = editable.toString();
                ((ListViewAdapter) listview.getAdapter()).getFilter().filter(filterText);
            }
        });

        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString();
                if(!filterText.equals(" ")) {
                    ((ListViewAdapter) listview.getAdapter()).getFilter().filter(filterText);

                }/*if(editTextFilter.getText().toString().equals("")){

                    editTextFilter.setEnabled(true);
                }*/
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }

}

