package ie.cm.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

import ie.cm.R;
import ie.cm.models.Coffee;

public class Add extends Base {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
    }

    public void addCoffee(View view)
    {
        EditText name = findViewById(R.id.addNameET);
        EditText shop = findViewById(R.id.addShopET);
        EditText price = findViewById(R.id.addPriceET);
        RatingBar ratingBar = findViewById(R.id.addRatingBar);

        double coffeePrice;


        String coffeeName = name.getText().toString();
        String coffeeShop = shop.getText().toString();
        try {
            coffeePrice = Double.parseDouble(price.getText().toString());
        }
        catch(NumberFormatException e){
            coffeePrice = 0.0;
        }
        float ratingValue = ratingBar.getRating();

        Coffee c = new Coffee(coffeeName, coffeeShop, ratingValue, coffeePrice, false);
        coffeeList.add(c);
        //Log.d("Coffee", coffeeList.get(0).toString());
        //startActivity(new Intent(this,Home.class));
    }
}
