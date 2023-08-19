package com.divyank.recyclerview

object constant {
    private lateinit var dataList:ArrayList<RvModel>
    fun getData():ArrayList<RvModel>{
        dataList=ArrayList<RvModel>()
        dataList.add(RvModel(R.drawable.food,"Ghar jaisa","Ayodhya"))
        dataList.add(RvModel(R.drawable.food,"Ghar jaisa","Ayodhya"))
        dataList.add(RvModel(R.drawable.food,"Ghar jaisa","Ayodhya"))
        dataList.add(RvModel(R.drawable.food,"Ghar jaisa","Ayodhya"))
        dataList.add(RvModel(R.drawable.food,"Ghar jaisa","Ayodhya"))
        dataList.add(RvModel(R.drawable.food,"Ghar jaisa","Ayodhya"))
        dataList.add(RvModel(R.drawable.food,"Ghar jaisa","Ayodhya"))
        dataList.add(RvModel(R.drawable.food,"Ghar jaisa","Ayodhya"))
        return dataList
    }
}