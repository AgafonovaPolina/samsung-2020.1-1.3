<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView4"
        android:layout_width="366dp"
        android:layout_height="89dp"
        android:background="#3FFA47"
        android:text="Добавте комментарий"
        app:autoSizeTextType="uniform"
        tools:layout_editor_absoluteX="22dp"
        tools:layout_editor_absoluteY="244dp"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="366dp"
        android:layout_height="89dp"
        android:background="#59F660"
        android:text="Установите время"
        app:autoSizeTextType="uniform"
        tools:layout_editor_absoluteX="22dp"
        tools:layout_editor_absoluteY="51dp"
        tools:ignore="MissingConstraints" />

    <EditText
        android:id="@+id/editTextTime"
        android:layout_width="367dp"
        android:layout_height="69dp"
        android:ems="10"
        android:inputType="time"
        tools:layout_editor_absoluteX="22dp"
        tools:layout_editor_absoluteY="140dp"
        tools:ignore="MissingConstraints" />

    <EditText
        android:id="@+id/editTextTime2"
        android:layout_width="367dp"
        android:layout_height="69dp"
        android:ems="10"
        android:inputType="time"
        tools:layout_editor_absoluteX="22dp"
        tools:layout_editor_absoluteY="335dp"
        tools:ignore="MissingConstraints" />

    <Button
        android:id="@+id/button5"
        android:layout_width="410dp"
        android:layout_height="119dp"
        android:text="Закончить"
        app:backgroundTint="#0FE418"
        tools:layout_editor_absoluteX="1dp"
        tools:layout_editor_absoluteY="612dp"
        tools:ignore="MissingConstraints" />

</androidx.constraintlayout.widget.ConstraintLayout>
 
Задачи приложения:
-подсчет и сообщение о приеме таблеток и окончании приема 
-список имеющихся лекарств(дома)
-поиск лекарства в аптеках указанного района и сравнение в них цен(список лекарств тоже допукается)    
