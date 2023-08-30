package com.example.happytreefriends.home.screen

import androidx.compose.runtime.Composable


@Composable
fun HomeRoute(
    viewModel: HomeViewModel = hiltViewModel(LocalContext.current as ComponentActivity),
    navigateToProfile: () -> Unit
) {
    HomeScreen()
}

@Composable
fun HomeScreen(
    navigateToProfile: () -> Unit
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(34.dp))
            Text("Hello World", fontSize = 30.sp)
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { navigateToProfile = navigateToProfile() }
            ) {

            }
        }
    }
}