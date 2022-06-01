package com.example.estacionamentor.domain.mask

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class PlateMask : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        if (text.isBlank()) return TransformedText(text, OffsetMapping.Identity)

        val splitCharacterIndex = 2
        val maxLength = 8
        val out = text.mapIndexed { index, char ->
            if (index == splitCharacterIndex) return@mapIndexed "$char-" else char
        }.fold("") { initial, char -> initial + char.toString() }

        val numberOffsetTranslator = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                return when{
                    offset <= splitCharacterIndex -> offset
                    offset <= maxLength -> offset + 1
                    else -> maxLength
                }
            }

            override fun transformedToOriginal(offset: Int): Int {
                return when{
                    offset <= splitCharacterIndex + 1 -> offset
                    offset <= maxLength + 1 -> offset - 1
                    else -> maxLength - 1
                }
            }
        }

        return TransformedText(AnnotatedString(out), numberOffsetTranslator)
    }
}