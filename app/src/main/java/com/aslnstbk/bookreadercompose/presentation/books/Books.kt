package com.aslnstbk.bookreadercompose.presentation.books

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.aslnstbk.bookreadercompose.presentation.ui.theme.Shapes

@Composable
fun BooksList() {
    LazyColumn(
        modifier = Modifier.padding(horizontal = 16.dp),
        contentPadding = PaddingValues(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { BookItem() }
        item { BookItem() }
        item { BookItem() }
        item { BookItem() }
        item { BookItem() }
        item { BookItem() }
        item { BookItem() }
    }
}

@Composable
fun BookItem() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = Shapes.large,
        border = BorderStroke(width = .5.dp, color = MaterialTheme.colors.primary)
    ) {
        Row(
            modifier = Modifier.padding(all = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                modifier = Modifier.size(98.dp, 145.dp).clip(Shapes.large),
                model = "https://randomwordgenerator.com/img/picture-generator/55e5d5434b55ad14f1dc8460962e33791c3ad6e04e507440762a7cd69449c4_640.jpg",
                contentDescription = "",
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.width(16.dp))

            Column {
                Text(text = "Author")
                Spacer(Modifier.height(4.dp))
                Text(text = "Title")
                Spacer(Modifier.height(4.dp))
                Text(text = "Something else...")
            }
        }
    }
}