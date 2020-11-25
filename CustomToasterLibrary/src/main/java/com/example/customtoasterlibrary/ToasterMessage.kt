package com.example.customtoasterlibrary

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class ToasterMessage(private var context: Context,
        private var message: String) {


    private var textColor: Int? = null
    private var backgroundColor: Int? = null
    private var image: Int? = null
    private var gravity: Int = Gravity.NO_GRAVITY
    private var duration: Int = Toast.LENGTH_LONG


    companion object {
        private var context: Context? = null
        private var message: String = ""
        fun with(context: Context, message: String): ToasterMessage {
            this.context = context
            this.message = message
            return ToasterMessage(context, message)
        }
    }

    /**
     * Set the text color of toast
     */
    fun setTextColor(textColor: Int): ToasterMessage {
        this.textColor = textColor
        return this
    }
    /**
     * Set the Background color of toast
     */
    fun setBackgroundColor(backgroundColor: Int): ToasterMessage {
        this.backgroundColor = backgroundColor
        return this
    }
    /**
     * Set the Image as icon in Toast
     */
    fun setImage(image: Int): ToasterMessage {
        this.image = image
        return this
    }
    /**
     * Set the location at which the Toast should appear on the screen.
     * e.g Gravity.Center
     */
    fun setGravity(gravity: Int): ToasterMessage {
        this.gravity = gravity
        return this
    }

    /**
     * Set how long to show the view for.
     * e.g Toast.LENGTH_SHORT or Toast.LENGTH_LONG
     */
    fun setDuration(duration: Int): ToasterMessage {
        this.duration = duration
        return this
    }

    fun build() {
        if (context == null) throw IllegalStateException("Context must be initialized")
        else {
            val layoutInflater: LayoutInflater = LayoutInflater.from(context)
            val view: View = layoutInflater.inflate(R.layout.image_toast, null, false)

            //Toast Message
            view.findViewById<TextView>(R.id.textView).text = message

            //Text Color
            view.findViewById<TextView>(R.id.textView).setTextColor(textColor ?: Color.WHITE)

            //TextView background Color
            view.background = Util.changeDrawableColor(context, R.drawable.background, backgroundColor
                    ?: Color.DKGRAY)

            //Image in Toast
            if (image != null) {
                view.findViewById<ImageView>(R.id.imageView).visibility = View.VISIBLE
                view.findViewById<ImageView>(R.id.imageView).setImageResource(image!!)
            } else view.findViewById<ImageView>(R.id.imageView).visibility = View.GONE

            val toast = Toast(context)
            toast.duration = duration
            toast.setGravity(gravity, 0, 0)
            toast.view = view
            toast.show()
        }
    }
}
