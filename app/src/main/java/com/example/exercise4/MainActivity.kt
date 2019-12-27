package com.example.exercise4

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgCalender.setOnClickListener {
            val c:Calendar = Calendar.getInstance();
            val currentDay = c.get(Calendar.DAY_OF_MONTH)
            val currentMonth = c.get(Calendar.MONTH);
            val currentYear = c.get(Calendar.YEAR);

            val dpd = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener{
                    view, year, month, day ->
                    dateTxt.setText(day.toString() + "/" + (month + 1).toString() + "/" + year.toString())

                    val currentAge:Int = currentYear - year;
                    ageResult.setText(currentAge.toString());

                    when (currentAge) {
                        in 16..20 -> {
                            savingResult.setText("RM 5,000.00")
                            val investAmount: Double = 5000.00 * 30 / 100;
                            investResult.setText("RM " + investAmount.toString() + "0")
                        }
                        in 21..25 -> {savingResult.setText("RM 14,000.00")
                            val investAmount: Double = 14000.00 * 30 / 100;
                            investResult.setText("RM " + investAmount.toString() + "0")
                        }
                        in 26..30 -> {savingResult.setText("RM 29,000.00")
                            val investAmount: Double = 29000.00 * 30.00 / 100.00;
                            investResult.setText("RM " + investAmount.toString() + "0")
                        }
                        in 31..35 -> {savingResult.setText("RM 50,000.00")
                            val investAmount: Double = 50000.00 * 30.00 / 100.00;
                            investResult.setText("RM " + investAmount.toString() + "0")
                        }
                        in 36..40 -> {savingResult.setText("RM 78,000.00")
                            val investAmount: Double = 78000.00 * 30.00 / 100.00;
                            investResult.setText("RM " + investAmount.toString() + "0")
                        }
                        in 41..45 -> {savingResult.setText("RM 116,000.00")
                            val investAmount: Double = 116000.00 * 30.00 / 100.00;
                            investResult.setText("RM " + investAmount.toString() + "0")
                        }
                        in 46..50 -> {savingResult.setText("RM 165,000.00")
                            val investAmount: Double = 165000.00 * 30.00 / 100.00;
                            investResult.setText("RM " + investAmount.toString() + "0")
                        }
                        in 51..55 -> {savingResult.setText("RM 228,000.00")
                            val investAmount: Double = 228000.00 * 30.00 / 100.00;
                            investResult.setText("RM " + investAmount.toString() + "0")
                        }
                        else -> savingResult.setText("Invalid Age...")
                    }
                }, currentYear, currentMonth, currentDay)

            dpd.show()
        }
    }
}
