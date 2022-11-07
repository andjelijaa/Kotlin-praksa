package com.example.kotlincourse

import android.content.Context
import com.example.kotlincourse.unit2.adapter.ItemAdapter
import com.example.kotlincourse.unit2.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test



class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    private  fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}