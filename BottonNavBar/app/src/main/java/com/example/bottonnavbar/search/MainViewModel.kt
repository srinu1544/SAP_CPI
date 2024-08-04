package com.example.bottonnavbar.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

@OptIn(FlowPreview::class)
class MainViewModel: ViewModel() {

    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _persons = MutableStateFlow(allPersons)
    val persons = searchText
        .debounce(1000L)
        .onEach { _isSearching.update { true } }
        .combine(_persons) { text, persons ->
            if(text.isBlank()) {
                persons
            } else {
                delay(2000L)
                persons.filter {
                    it.doesMatchSearchQuery(text)
                }
            }
        }
        .onEach { _isSearching.update { false } }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _persons.value
        )

    fun onSearchTextChange(text: String) {
        _searchText.value = text
    }
}

data class Person(
    val firstName: String,
    val lastName: String
) {
    fun doesMatchSearchQuery(query: String): Boolean {
        val matchingCombinations = listOf(
            "$firstName$lastName",
            "$firstName $lastName",
            "${firstName.first()} ${lastName.first()}",
        )

        return matchingCombinations.any {
            it.contains(query, ignoreCase = true)
        }
    }
}

private val allPersons = listOf(
    Person(
        firstName = "Arjun",
        lastName = "A"
    ),
    Person(
        firstName = "Babi",
        lastName = "Gudavel"
    ),
    Person(
        firstName = "Chandra",
        lastName = "Budd"
    ),
    Person(
        firstName = "David",
        lastName = "Stops"
    ),
    Person(
        firstName = "Swathi",
        lastName = "Reddy"
    ),
    Person(
        firstName = "Srinivas",
        lastName = "Ramoju"
    ),
    Person(
        firstName = "Roja",
        lastName = "Ramoju"
    ),
    Person(
        firstName = "Siri",
        lastName = "Ramoju"
    ),
    Person(
        firstName = "ChrisP.",
        lastName = "Bacon"
    ),
    Person(
        firstName = "Swrtha",
        lastName = "malla"
    ),
    Person(
        firstName = "Susma",
        lastName = "jdd"
    ),
    Person(
        firstName = "Suresh",
        lastName = "vemuri"
    ),
)