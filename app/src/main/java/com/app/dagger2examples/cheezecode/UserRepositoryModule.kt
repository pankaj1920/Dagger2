package com.app.dagger2examples.cheezecode

import dagger.Binds
import dagger.Module
import dagger.Provides

//@Module
//class UserRepositoryModule {
//
//    @Provides
//    fun getFirebaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }
//
//    @Provides
//    fun getSqlRepository(sqlRepository: SqlRepository): UserRepository {
//        return sqlRepository
//
//    }
//
//}

@Module
abstract class UserRepositoryModule {
    /*
        @Provides
        fun getFirebaseRepository(): UserRepository {
            return FirebaseRepository()
        }*/

    // SqlRepository ka object dagger khud se bana sakta hai kyuki SqlRepository ke constructor me inject hai
    // . issliye hum binds use karenge agar constructor me inject nhi hai to dagger khud object nhi bana sakta hai uss case me provide use krte hai
    @Binds
    abstract fun getSqlRepository(sqlRepository: SqlRepository): UserRepository

}