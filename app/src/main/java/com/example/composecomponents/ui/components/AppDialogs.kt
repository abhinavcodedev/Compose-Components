package com.example.composecomponents.ui.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AppAlertDialog(
    title: String,
    description: String,
    confirmText: String = "OK",
    dismissText: String = "Cancel",
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(title)
        },
        text = {
            Text(description)
        },
        confirmButton = {

            TextButton(onClick = onConfirm) {
                Text(confirmText)
            }
        },
        dismissButton = {

            TextButton(onClick = onDismiss) {
                Text(dismissText)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DialogPreview() {
    MaterialTheme {
        AppAlertDialog(
            title = "Delete Item",
            description = "Are you sure you want to delete this item?",
            onConfirm = {},
            onDismiss = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AppAlertDialogPreview() {
    AppAlertDialog(
        title = "Delete Item",
        description = "Are you sure?",
        onConfirm = {},
        onDismiss = {}
    )
}