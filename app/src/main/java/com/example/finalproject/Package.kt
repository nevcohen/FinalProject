package com.example.finalproject
enum class PackageType{
ENVELOP,SMALL,LARGE
}
data class Package (val packageType:PackageType, val IsFragile:Boolean, val weight:Int,  ) {
}