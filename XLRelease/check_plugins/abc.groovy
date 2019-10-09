// Exported from:        http://DESKTOP-RFIQ2A0:5516/#/templates/Foldera193ffce62c443439b6057fe8132d37b-Release7e799da780884a12a5170baed6eff0e6/releasefile
// XL Release version:   9.0.4
// Date created:         Wed Oct 09 12:11:52 IST 2019

xlr {
  template('abc') {
    folder('check_plugins')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-10-07T09:00:00+0530')
    phases {
      phase('New Phase') {
        tasks {
          manual('jh') {
            
          }
          manual('bbbb') {
            
          }
          manual('bll') {
            
          }
          manual('check_!23') {
            
          }
        }
      }
    }
    releaseTriggers {
      gitPoll('git_trigger') {
        releaseTitle 'trigger_func2'
        tags 'git'
        gitRepository 'git_server'
        branch 'master'
      }
    }
    
  }
}