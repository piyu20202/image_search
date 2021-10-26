package com.ass.imagegallery.api

import com.ass.imagegallery.data.GalleryImage


data class ImageSearchResponse(val hits : List<GalleryImage>) {
}