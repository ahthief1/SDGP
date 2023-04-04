
package org.tensorflow.lite.examples.objectdetection

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import org.tensorflow.lite.task.vision.detector.Detection
import java.util.*
import kotlin.math.max

class OverlayView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private var results: List<Detection> = LinkedList<Detection>()
    private var boxPaint = Paint()
    private var textBackgroundPaint = Paint()
    private var textPaint = Paint()

    private var scaleFactor: Float = 1f

    private var bounds = Rect()

    private var totalBill = 0.0

    var detectedItems = mutableListOf<String>()





    init {
        initPaints()

    }




    fun clear() {
        textPaint.reset()
        textBackgroundPaint.reset()
        boxPaint.reset()
        invalidate()
        initPaints()
    }

    private fun initPaints() {
        textBackgroundPaint.color = Color.BLACK
        textBackgroundPaint.style = Paint.Style.FILL
        textBackgroundPaint.textSize = 50f

        textPaint.color = Color.GREEN
        textPaint.style = Paint.Style.FILL
        textPaint.textSize = 50f


        boxPaint.color = ContextCompat.getColor(context!!, R.color.bounding_box_color)
        boxPaint.strokeWidth = 8F
        boxPaint.style = Paint.Style.STROKE
    }




    override fun draw(canvas: Canvas) {
        super.draw(canvas)
        detectedItems.clear()
        totalBill = 0.0
        for (result in results) {
            val boundingBox = result.boundingBox

            val top = boundingBox.top * scaleFactor
            val bottom = boundingBox.bottom * scaleFactor
            val left = boundingBox.left * scaleFactor
            val right = boundingBox.right * scaleFactor

            // Draw bounding box around detected objects
            val drawableRect = RectF(left, top, right, bottom)
            canvas.drawRect(drawableRect, boxPaint)

            // Create text to display alongside detected objects
            val drawableText =
                result.categories[0].label + " " +
                        String.format("%.2f", result.categories[0].score)

            // Draw rect behind display text
            textBackgroundPaint.getTextBounds(drawableText, 0, drawableText.length, bounds)
            val textWidth = bounds.width()
            val textHeight = bounds.height()
            canvas.drawRect(
                left,
                top,
                left + textWidth + Companion.BOUNDING_RECT_TEXT_PADDING,
                top + textHeight + Companion.BOUNDING_RECT_TEXT_PADDING,
                textBackgroundPaint
            )

            // Draw text for detected object
            canvas.drawText(drawableText, left, top + bounds.height(), textPaint)
            // Add detected item to list
            val item = result.categories[0].label
            if (!detectedItems.contains(item)) {
                detectedItems.add(item)
            }

            // Add item price to total bill
            val price = getItemPrice(item)
            totalBill += price


        }
        // Display detected items and total bill
        canvas.drawText("Products in cart:", 50f, 100f, textBackgroundPaint)
        canvas.drawText("Price:", 700f, 100f, textBackgroundPaint)
        var y = 200f
        for (item in detectedItems) {
            canvas.drawText(item.toUpperCase(), 150f, y, textPaint)
            val price = getItemPrice(item)
            canvas.drawText(price.toString(), 700f, y, textPaint)
            y += 150f
        }
        canvas.drawText("Total Bill: Rs " + String.format("%.2f", totalBill), 50f, y, textBackgroundPaint)
        
    }

    fun setResults(
      detectionResults: MutableList<Detection>,
      imageHeight: Int,
      imageWidth: Int,
    ) {
        results = detectionResults

        // PreviewView is in FILL_START mode. So we need to scale up the bounding box to match with
        // the size that the captured images will be displayed.
        scaleFactor = max(width * 1f / imageWidth, height * 1f / imageHeight)
    }

    companion object {
        private const val BOUNDING_RECT_TEXT_PADDING = 8
    }
    data class Item(val name: String, val price: Double)

    val groceryStoreItems = listOf(
        Item("bed", 100.5),
        Item("bottle", 50.25),
    )

    fun getItemPrice(itemName: String): Double {
        return groceryStoreItems.find { it.name == itemName }?.price?: 0.0

    }





}
