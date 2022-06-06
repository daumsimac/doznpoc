
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DepositManager from "./components/DepositManager"

import DepositManager from "./components/DepositManager"

import DepositManager from "./components/DepositManager"

import DepositReplyManager from "./components/DepositReplyManager"

import DepositReplyManager from "./components/DepositReplyManager"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/deposits',
                name: 'DepositManager',
                component: DepositManager
            },

            {
                path: '/deposits',
                name: 'DepositManager',
                component: DepositManager
            },

            {
                path: '/deposits',
                name: 'DepositManager',
                component: DepositManager
            },

            {
                path: '/depositReplies',
                name: 'DepositReplyManager',
                component: DepositReplyManager
            },

            {
                path: '/depositReplies',
                name: 'DepositReplyManager',
                component: DepositReplyManager
            },



    ]
})
