<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:padding="16dp">

    <TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Hotel Booking System"
android:textSize="24sp"
android:layout_marginBottom="16dp" />

    <TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Select Room Type:" />

    <RadioGroup
android:id="@+id/radio_group_room_type"
android:layout_width="wrap_content"
android:layout_height="wrap_content">
        <RadioButton
android:id="@+id/radio_single"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Single Room" />
        <RadioButton
android:id="@+id/radio_double"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Double Room" />
        <RadioButton
android:id="@+id/radio_suite"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Suite" />
    </RadioGroup>

    <CheckBox
android:id="@+id/checkbox_breakfast"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Add Breakfast ($15)" />

    <TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Rate Your Stay:" />

    <RatingBar
android:id="@+id/rating_bar"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:numStars="5"
android:stepSize="1.0"
android:rating="0" />

    <TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Adjust Volume:" />

    <SeekBar
android:id="@+id/seekbar_volume"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:max="100" />

    <Switch
android:id="@+id/switch_notifications"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Receive Promotions" />

    <Button
android:id="@+id/button_submit"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="Submit Booking"
android:layout_marginTop="16dp" />

</LinearLayout>
