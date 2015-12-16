# CirclePercentView
An Android CirclePercentView 
<<<<<<< HEAD
=======

###Perview
![image](https://github.com/githubwing/CirclePercentView/raw/master/perview.gif)
###How To Use
add a CirclePercentView into your XML.

```
<com.wingsofts.circlepercentview.CirclePercentView
    android:id="@+id/circleView"
    app:stripeWidth="15dp"    
    app:centerTextSize="16sp"
    app:percent="45"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```
you can change percent by call method setPercent()
```
   mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = (int)(Math.random()*100);
                mCirclePercentView.setPercent(n);
            }
        });

```
