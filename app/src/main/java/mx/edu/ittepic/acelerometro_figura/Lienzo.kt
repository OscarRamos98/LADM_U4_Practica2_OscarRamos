package mx.edu.ittepic.acelerometro_figura

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.view.Display
import android.view.View
import android.view.WindowManager
import androidx.core.content.ContextCompat.getSystemService

class Lienzo(p:MainActivity) : View(p)  {
    var puntero = p




    var avatar = BitmapFactory.decodeResource(resources,R.drawable.avatar)
    var avatarg = BitmapFactory.decodeResource(resources,R.drawable.avatarg)

     var avatar2 = FiguraGeometrica(10,500,avatarg)

    var avatar1 = FiguraGeometrica(10,500,avatar)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()
        canvas.drawColor(Color.BLACK)
        avatar1.pintar(canvas,paint)




    }


}