package com.mukisasamuel.intellitechacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class CoursesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view:View = inflater!!.inflate (R.layout.fragment_courses, container, false)
        val myWeb1 = view?.findViewById(R.id.webview2) as WebView
        myWeb1.apply {
         loadUrl("www.intellectitechacademy.com/courses")
          webViewClient = WebViewClient()
          settings.javaScriptEnabled = true
        }
        return view
    }

    }
