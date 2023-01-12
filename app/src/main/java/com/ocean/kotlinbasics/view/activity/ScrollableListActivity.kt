package com.ocean.kotlinbasics.view.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ocean.kotlinbasics.model.Affirmation
import com.ocean.kotlinbasics.view.activity.ui.theme.KotlinBasicsAppTheme

class ScrollableListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AffirmationApp()
        }
    }
}

@Composable
fun AffirmationApp() {
//    AffirmationsTheme{}
}

@Composable
fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(id = affirmation.imageResourceId),
            contentDescription = stringResource(id = affirmation.stringResouceId),
            modifier = Modifier
                .fillMaxWidth()
                .height(194.dp),
            contentScale = ContentScale.Crop
        )

        Text(text = stringResource(id = affirmation.stringResouceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6)
        
    }
}

@Preview
@Composable
fun AffirmationCardPreview() {
//    AffirmationsTheme{
//        AffirmationCard(affirmation = Affirmation(string.affirmation1, drawable.image1))
//    }
}