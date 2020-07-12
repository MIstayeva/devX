package packg1;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Third file");
        System.out.println("git log changes");

        /**
         * /**
         *      *
         *      * Git - version control system
         *      *
         *      * VCS - category of software tools that help record changes made to files by keeping track of modifications you have done to the code.
         *      * you also can recall specific version later.
         *      * also makes collaboration easier ...
         *      *
         *      * Repository - central file storage location.Used by version control systems to store multiple version of a file.
         *      *
         *      * Git repositories:
         *      * 1. Local - local repo is on ur computer and has for only ur direct use. It contains the history of changes u have made.
         *      * 2. Remote - central repo in the cloud. Ppl can retrieve and suggest changes to files or create new files.typically, we work in teams, and need to
         *      * work on a codebase together. codebase is on a central (elswhere and for ur indirect use)
         *      *
         *      * GIT Life Cycle:
         *      *
         *      *    1. Working directory(untracked by GIT) just
         *      *          command --> git init(initialize)
         *      *    2. Working dir(tracked by git)
         *      *          command --> git add
         *      *    3. staging area
         *      *          git commit
         *      *    4. Local repo
         *      *          git push
         *      *    5. sending to remote repo
         *      *
         *      * GIT commands:
         *      *
         *      *    git status - to retrieve and see files that were changed and needs to be comitted
         *      *    git init - initialize local repo for the folder
         *      *    touch file name - to create new file
         *      *    echo 'text to be added' > sign and file name - to add text to file
         *      *    git restore - to discard changes in working directory
         *      *    git add <file> - add changes to staging area, update what will be committed
         *      *    git add .(Mac) git add *(Windows) - add all the changes to staging
         *      *    git add All -
         *      *    git commit -
         *      *    git commit ~m "first commit" - to confirm changes
         *      *    git push -
         *      *
         *
         *      Create class in intelij —> open terminal in intelij
         * U already gonna be in the folder of ur intelij project
         * First step
         * Git init origin masternit - to initialize new repository in this folder
         * Agter we make changes we call next command —>
         * git add .
         * And then can check status  —> git status
         * Git commit -m “some message(changes u made)”
         * Git remote add origin https://github.com/MIstayeva/devX.git(link of repository) - one time thing to make a connection to ur repository-then we just push files with this command —> git push origin master
         * Git push origin master
         * Then enter user name and password confirm
         * Go to gidHub and update page
         * And u will see added files
         *
         * git log - to see changes history and after bring some
         * changes to intelij file
         *
         *
         */
    }
}




